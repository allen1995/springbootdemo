package com.allen.springbootdemo.readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: allen
 * @Date: 2020-05-14 22:47
 * @Description:
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    @Autowired
    private ReadingListReposity readingListReposity;

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readerBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readingList = readingListReposity.findByReader(reader);
        if( readingList != null ){
            model.addAttribute("books", readingList);
        }

        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book){

        book.setReader(reader);
        readingListReposity.save(book);
        return "redirect:/{reader}";
    }
}
