package com.example.cookie;

public class ProductIO {
    public static Product getProduct(String code) {
        if (code == null) {
            return null;
        }
        return switch (code) {
            case "8601" -> new Product("8601", "86 (the band) - True Life Songs and Pictures", 14.95);
            case "pf01" -> new Product("pf01", "Paddlefoot - The first CD", 12.95);
            case "pf02" -> new Product("pf02", "Paddlefoot - The second CD", 14.95);
            case "jr01" -> new Product("jr01", "Joe Rut - Genuine Wood Grained Finish", 14.95);
            default -> null;
        };
    }
}
