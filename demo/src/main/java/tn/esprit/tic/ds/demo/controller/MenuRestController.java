package tn.esprit.tic.ds.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ds.demo.entity.Menu;
import tn.esprit.tic.ds.demo.entity.TypeMenu;
import tn.esprit.tic.ds.demo.service.IMenuService;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")
public class MenuRestController {
    IMenuService menuService;
    //http://localhost:8089/menu/menu/retrieve-menu
@GetMapping("/retrieve-menu/{type}/{prix}")
    public List<Menu> FindMenu(@PathVariable("type") TypeMenu type, @PathVariable("prix") float prix){
    List<Menu> listMenus= menuService.findMenu(type,prix);
    return listMenus;
}

}
