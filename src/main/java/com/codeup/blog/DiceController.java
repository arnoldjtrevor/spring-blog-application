package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {

    @GetMapping("/dice-game")
    public String showDiceForm() {
        return "diceGame";
    }

    @GetMapping("/dice-game/{n}")
    public String roll(@PathVariable int n, Model model) {
        int randNum = (int) (Math.random() * 6) + 1;
        String msg = "lol u flop";
        if(n == randNum) {
            msg = "queeeeen tiy";
        }
        model.addAttribute("rand", randNum);
        model.addAttribute("guess", n);
        model.addAttribute("message", msg);
        model.addAttribute("title", "DiceRoll");
        return "diceGame";
    }
}