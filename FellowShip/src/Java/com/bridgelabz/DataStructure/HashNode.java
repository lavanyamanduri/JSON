package com.bridgelabz.DataStructure;
/*****************************************************************************
 *  Purpose: Program is written for HashNode  ( Reusability of Code ) .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   23-12-2019
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
