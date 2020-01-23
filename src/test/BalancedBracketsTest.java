package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void lauchCodeInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LauchCode]"));
    }

    @Test
    public void bracketsFirst() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]thenText"));
    }

    @Test
    public void bracketsLast() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("wordThen[]"));
    }

    @Test
    public void bracketsInTheMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Word[]moreWords"));
    }

    @Test
    public void bracketsBetweenSpaces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" [] "));
    }

    @Test
    public void firstFailingBracketTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Brackets ] out of order ["));
    }

    @Test
    public void repeatedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void firstComputer() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Apple ]["));
    }

    @Test
    public void whatIsThis() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]][[]][[]]["));
    }

    @Test
    public void willThisPass() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][][][][]"));
    }

}
