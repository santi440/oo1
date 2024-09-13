package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String descripcion;
	private boolean destacado; 
	private int likes;
	
	public WallPostImpl() {
		descripcion = "Undefined post";
		destacado = false;
		likes = 0;
	}
	
	/*
	 * Retorna el texto descriptivo de la publicación
	 */
	public String getText() {
		return descripcion;
	}
	
	/*
	 * Setea el texto descriptivo de la publicación
	 */
	public void setText(String text) {
		this.descripcion = text; 
	}
	
	/*
	 * Retorna la cantidad de “me gusta” 
	 */
	public int getLikes() {
		return likes;
	}
	
	/*
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.likes ++;
	}
	
	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	public void dislike() {
		if (this.likes > 0) {
			this.likes --;
		}
	}
	
	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario 
	 */
	public boolean isFeatured() {
		return this.destacado;
	}
	
	/*
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		this.destacado = !this.destacado;
	}
		
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
