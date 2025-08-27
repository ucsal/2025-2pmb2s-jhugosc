package br.com.mariojp.solid.srp;

import java.util.List;

public class ReceiptFormatter {
    public String format(double subtotal, double tax, double total, List<Item> items) {
		StringBuilder sb = new StringBuilder();
		sb.append("=== RECIBO ===\n");
		for (var item : items) {
            sb.append(item.getName()).append(" x").append(item.getQuantity())
              .append(" = ").append(item.getUnitPrice() * item.getQuantity())
              .append("\n");
	}
	sb.append("--------------------\n");
	sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("Tax: ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");

        return sb.toString();
	}
}