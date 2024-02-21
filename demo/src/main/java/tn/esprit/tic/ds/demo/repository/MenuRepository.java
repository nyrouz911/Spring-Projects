package tn.esprit.tic.ds.demo.repository;

import tn.esprit.tic.ds.demo.entity.Menu;

import java.util.List;

public interface MenuRepository {
    List<Menu>  FindByTypeMenuAndPrixTotalGreaterThan(Float prix);
}
