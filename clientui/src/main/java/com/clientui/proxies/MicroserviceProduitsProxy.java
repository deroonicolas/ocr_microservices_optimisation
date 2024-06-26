package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.clientui.beans.ProductBean;

// Delete URL for Ribbon
//@FeignClient(name = "microservice-produits"/*, url = "localhost:9001"*/)
@FeignClient(name = "microservice-produits")
public interface MicroserviceProduitsProxy {

	@GetMapping(value = "/Produits")
	List<ProductBean> listeDesProduits();

	/*
	 * Notez ici la notation @PathVariable("id") qui est différente de celle qu'on
	 * utlise dans le contrôleur
	 **/
	@GetMapping(value = "/Produits/{id}")
	ProductBean recupererUnProduit(@PathVariable("id") int id);

}
