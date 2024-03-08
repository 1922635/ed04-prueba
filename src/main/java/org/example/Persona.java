package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Manuel
 * @version 1.1
 * @since 07/03/2024
 */

class Persona {
    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}