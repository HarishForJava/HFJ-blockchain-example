package com.hfj.blockchain;

import java.util.Arrays;

public class BlockChainExample {
	public static void main(String[] args) {

		 // Block = data + previous hash;

		Transaction transaction1 = new Transaction(10456460L);
		Transaction transaction2 = new Transaction(146646000L);
		Transaction transaction3 = new Transaction(46100640L);
		Transaction transaction4 = new Transaction(146645460L);

		Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
		System.out.println("Chain 1 Hash:   " + firstBlock.hashCode());
		Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
		System.out.println("Chain 2 Hash:   " + secondBlock.hashCode());
		Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
		System.out.println("Chain 3 Hash:   " + thirdBlock.hashCode());
	}
}