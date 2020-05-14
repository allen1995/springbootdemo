package com.allen.springbootdemo.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: allen
 * @Date: 2020-05-14 22:45
 * @Description:
 */
public interface ReadingListReposity extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}
