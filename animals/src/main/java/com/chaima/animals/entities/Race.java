package com.chaima.animals.entities;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Race {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idRace;
	private String nomRace;
	private String descriptionRace;
	@OneToMany(mappedBy = "race")
	private List<Animal> animals;
	public Race() {}
	public Race(String nomRace, String descriptionRace, List<Animal> animals)
	{
	super();
	this.nomRace = nomRace;
	this.descriptionRace = descriptionRace;
	this.animals = animals;
	}
	public Long getIdRace() {
	return idRace;
	}
	public void setIdRace(Long idRace) {
	this.idRace = idRace;
	}
	public String getNomRace() {
	return nomRace;
	}
	public void setNomRace(String nomRace) {
	this.nomRace = nomRace;
	}
	public String getDescriptionRace() {
	return descriptionRace;
	}
	public void setDescriptionRace(String descriptionRace) {
	this.descriptionRace = descriptionRace;
	}
	public List<Animal> getAnimals() {
	return animals;
	}
	public void setProduits(List<Animal> animals) {
	this.animals = animals;
	}
}
