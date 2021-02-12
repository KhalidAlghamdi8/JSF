package com.example.custom.converter;
/**
 *
 * @author D.Geary, C.Horstmann
 */
import java.io.Serializable;

public class CreditCard implements Serializable {
   private String number;

   public CreditCard(String number) { this.number = number; }
   public String toString() { return number; }
}
