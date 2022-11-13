/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.functions.model.bibd;

import jakarta.json.Json;
import jakarta.json.JsonObjectBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class BlockToEvaluate {

    private List<String> items = new ArrayList();

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public String toJson() {
        JsonObjectBuilder job = Json.createObjectBuilder();
        int i = 0;
        for (String item : items) {
            job.add(String.valueOf(i++), item);
        }
        return job.build().toString();
    }

}
