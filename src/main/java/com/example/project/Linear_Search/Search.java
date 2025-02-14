package com.example.project.Linear_Search;
import java.util.ArrayList;

public class Search {

    public static int linearSearchFirst(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(int[] elements, int target) {
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(int[] elements, int target) {
        int count  = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int linearSearchFirst(ArrayList<Integer> elements, int target) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(ArrayList<Integer> elements, int target) {
        for (int i = elements.size() - 1; i >= 0; i--) {
            if (elements.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(ArrayList<Integer> elements, int target) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(ArrayList<Integer> elements, int target) {
        int count  = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                count++;
            }
        }
        return count;
    }
}