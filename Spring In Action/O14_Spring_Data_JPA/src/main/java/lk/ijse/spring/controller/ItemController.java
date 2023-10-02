package lk.ijse.spring.controller;

import lk.ijse.spring.dao.ItemDAO;
import lk.ijse.spring.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemDAO itemDAO;

    @PostMapping
    public void addItem(Item dto){
        itemDAO.save(dto);
    }

    @DeleteMapping(params = {"code"})
    public void deleteItem(String code){
        itemDAO.deleteById(code);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemDAO.findAll();
    }

    @GetMapping(params = {"code"})
    public Item findItem(String code){
        return itemDAO.findById(code).get();
    }

    @PutMapping
    public void updateItem(@RequestBody Item i){
        itemDAO.save(i);
    }



}
