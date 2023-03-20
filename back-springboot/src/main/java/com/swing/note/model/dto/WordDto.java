package com.swing.note.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class WordDto {
	private Integer wordId;
	private String content;
	private String meaningKr;
	private String meaningEn;
}
