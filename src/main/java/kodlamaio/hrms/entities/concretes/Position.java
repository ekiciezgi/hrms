package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="positions")
@AllArgsConstructor
@NoArgsConstructor
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="person_id")
	private String personId;
	
	@Column(name="position_name")
	private String positionName;

}
