package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {
    // 가격 오름차순 정렬
    @Override
    public int compare(BookDTO o1, BookDTO o2) {    // 한번에 2개만 비교하는 알고리즘이기에 2개만 전달
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }

    // Comparator을 반드시 구현하고, 메서드이름을 compare로 만들어야 sort에 객체만 전달해도 메서드가 전달됨

    // but 매번 정렬규칙을 클래스로 분리하는게 번거러움 -> 람다식이나 Comparator.comparing() 메서드를 사용함
}
