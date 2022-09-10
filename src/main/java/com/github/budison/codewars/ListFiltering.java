package com.github.budison.codewars;

import java.util.List;

/**
 * @author Kevin Nowak
 */
class ListFiltering {

    /**
     * Filter out all non-integer elements from the given input list
     *
     * @param list The list to filter out from
     *
     * @return A copy of the original list with all the non-integer elements removed
     */
    static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}
