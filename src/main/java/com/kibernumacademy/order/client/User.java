package com.kibernumacademy.order.client;

/**
 * Modelo que va representar a un Usuario
 * Este Modelo debe coincidir con la estructura del User Service (microservicio)
 * Esto no es Entity ni se transforma en una tabla dentro de la base de datos del microservicio order
 */
public class User {

  private Long id;
  private String name;
  private String email;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
}
