/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author Electronica
 */
public  class Publication {

    protected String name;
    protected int id;
    protected int version;
    protected int stock;
    protected int price;
    protected int time;

    public Publication() {
    }

    public Publication(String name, int id, int version,  int price,int stock) {
        this.name = name;
        this.id = id;
        this.version = version;
        this.stock = stock;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

   public int getStock() {
        return stock;
  }

    public void setStock(int stock) {
      this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
