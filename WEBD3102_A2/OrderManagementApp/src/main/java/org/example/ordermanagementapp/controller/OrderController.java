package org.example.ordermanagementapp.controller;

import jakarta.servlet.http.HttpSession;
import org.example.ordermanagementapp.model.Order;
import org.example.ordermanagementapp.model.Product;
import org.example.ordermanagementapp.model.User;
import org.example.ordermanagementapp.repository.OrderRepository;
import org.example.ordermanagementapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/place")
    public String placeOrder(@RequestParam Long productId, @RequestParam int quantity,
                             HttpSession session, Model model) {
        User loggedUser = (User) session.getAttribute("loggedUser");
        if (loggedUser == null) {
            return "redirect:/users/login";
        }
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null || product.getQuantity() < quantity) {
            return "redirect:/products/list?error=NotAvailable";
        }
        double totalPrice = product.getPrice() * quantity;
        Order newOrder = new Order(loggedUser, product, quantity, totalPrice);
        orderRepository.save(newOrder);

        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);

        model.addAttribute("order", newOrder);
        return "order-confirmation";
    }
}
