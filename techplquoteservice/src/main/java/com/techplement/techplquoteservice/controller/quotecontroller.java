package com.techplement.techplquoteservice.controller;

import com.techplement.techplquoteservice.models.Quotes;
import com.techplement.techplquoteservice.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class quotecontroller {

    @Autowired
    private QuotesService quotesService;

    //create method getQuotesbyid
    @GetMapping("/getQuotesById")
    public Quotes getQuotesById(@RequestParam String id) {
        return quotesService.getQuote(id);
    }

    @GetMapping("/getQuotesByQuoteId")
    public Quotes getQuotesByQuoteId(@RequestParam int quoteid) {
        return quotesService.getQuoteByQuoteId(quoteid);
    }

    @GetMapping("/getAllQuotes")
    public List<Quotes> getAllQuotes() {
        return quotesService.getAllQuotes();
    }

    @PostMapping("/createQuotes")
    public Quotes createQuotes(@RequestBody Quotes student) {
        System.out.println("creating Student:" + student);
        return quotesService.createQuote(student);
    }

    @PutMapping("/updateQuotes")
    public Quotes updateQuotes(@RequestBody Quotes student) {
        System.out.println("creating Student:" + student);
        return quotesService.updateQuote(student);

    }

    @DeleteMapping("/deleteQuotes")
    public Boolean deleteQuotes(@RequestParam String id) {
        System.out.println("creating Student:" + id);
        quotesService.deleteQuote(id);
        return true;
    }

    @DeleteMapping("/deleteQuotesByQuoteId")
    public Boolean deleteQuotesByQuoteId(@RequestParam int quoteid) {
        System.out.println("creating Student:" + quoteid);
        quotesService.deleteQuoteByQuoteId(quoteid);
        return true;
    }

    @GetMapping("/getRandomQuote")
    public Quotes getRandomQuote() {
        return quotesService.getRandomQuote();
    }

    //create method getQuotesByAuthor
    @GetMapping("/getQuotesByAuthor")
    public List<Quotes> getQuotesByAuthor(@RequestParam String author) {
        return quotesService.getQuotesByAuthor(author);
    }
}
