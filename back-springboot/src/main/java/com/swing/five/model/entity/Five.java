package com.swing.five.model.entity;

import com.swing.user.model.entity.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Five {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fiveRankId;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	private Integer score;
}
