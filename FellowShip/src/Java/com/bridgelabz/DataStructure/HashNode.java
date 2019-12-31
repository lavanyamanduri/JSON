package com.bridgelabz.DataStructure;
/******************************************************************************
 *  Purpose: Program is written for HashNode  ( Reusability of Code ) .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   23-12-2020
 *
 ******************************************************************************/
	public class HashNode<K, V> {
		K key;
		V value;
		HashNode<K, V> next;

		HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
}
