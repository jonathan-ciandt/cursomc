package com.jonathan.cursomc.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jonathan.cursomc.cursomc.domain.Categoria;
import com.jonathan.cursomc.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

  @Autowired private CategoriaRepository categoriaRepository;

  public static void main(String[] args) {
    SpringApplication.run(CursomcApplication.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    Categoria cat1 = new Categoria(null, "informática");
    Categoria cat2 = new Categoria(null, "escritório");

    categoriaRepository.save(Arrays.asList(cat1, cat2));
  }
}
