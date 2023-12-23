package com.magicforest.magicforest.model.dto.mouseDTO;

import jakarta.persistence.Column;

public class MouseDetailsDTO {

    @Column(name = "кол. кнопок")
    private byte numbersOfButtons;

    @Column(name = "кол. програм. кнопок")
    private byte numbersOfProgrammingButtons;

    @Column(name = "колесо прокрутки")
    private boolean hasScrollWheel;

}
