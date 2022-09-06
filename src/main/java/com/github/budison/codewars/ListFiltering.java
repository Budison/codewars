package com.github.budison.codewars;

import java.util.List;

class ListFiltering {

//    static List<Object> filterList(final List<Object> list) {
//        List<Object> ret = new ArrayList<>();
//
//        for (Object obj : list) {
//            if (obj.getClass() == Integer.class) {
//                ret.add(obj);
//            }
//        }
//
//        return ret;
//    }

//    static List<Object> filterList(final List<Object> list) {
//        return list.stream()
//                .filter(e -> e instanceof Integer)
//                .collect(Collectors.toList());
//    }

    static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}
