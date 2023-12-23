package com.magicforest.magicforest.model.dto;


import com.magicforest.magicforest.model.entity.products.keyboard.KeyboardCommonCharacteristics;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeyboardSummaryDTO {

    private KeyboardCommonCharacteristics common;

}
