/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.Produto1.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.api.Produto1.model.ProdutoModelo;
import java.util.List;


public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{
    
    //Listar todos os produtos
    List<ProdutoModelo> findall();
    
    //Pesquisar por codigo
    ProdutoModelo findByCigo();
    
    //remover produto
    
    void delete(ProdutoModelo produto);
     
    //cadastrar/alterar produto
    //ProdutoModelo save(ProdutoModelo produto);
      <ProdMod extends ProdutoModelo> ProdMod save(ProdMod entity);      
    
    
    
    
}
