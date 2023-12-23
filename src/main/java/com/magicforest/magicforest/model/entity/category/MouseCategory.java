package com.magicforest.magicforest.model.entity.category;

import com.magicforest.magicforest.model.entity.products.mouse.Mouse;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class MouseCategory extends Category {

    @OneToMany(mappedBy = "category")
    private List<Mouse> mouseCategory;

}
