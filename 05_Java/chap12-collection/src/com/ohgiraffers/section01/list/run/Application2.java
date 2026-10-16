package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();     // 다른 패키지에 있기때문에 import 필요

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));  // 매개변수 있는 생성자를 사용 - 객체를 생성하면서 전달함
        bookList.add(new BookDTO(2, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));

        System.out.println(bookList);   // toString 오버라이딩 해놨기에 객체 속성들이 나옴

        Collections.sort(bookList); // BookDTO에는 정렬기준이 없기에 컴파일 오류 - 정렬기준 구현 후 사용
        System.out.println("bookList = " + bookList);
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        /*
        * 기본값과 다른 기준으로 정렬
        * 별도의 Comparator구현한 구현체인 AscendingPrice를 전달한다.
        * */

        bookList.sort(new AscendingPrice());    // 가격 비교규칙을 가진 객체 - BookList.sort가 compare을 여러번 호출해서 규칙에 따라 정렬
        System.out.println("가격 오름차순 정렬");
        for(BookDTO book: bookList) {
            System.out.println(book);
        }

    }
}
