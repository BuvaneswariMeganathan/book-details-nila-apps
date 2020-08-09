package com.nila.apps.bookdetails;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nila.apps.bookdetails.controller.BooksRestController;
import com.nila.apps.bookdetails.entity.Books;
import com.nila.apps.bookdetails.service.BooksService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = BooksRestController.class)
public class BooksRestControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BooksService booksService;


	@Test
	public void retrieveDetailsForBooks() throws Exception {
		
		List<Books> booksList = new ArrayList<Books>();
		booksList.add(new Books("The Secret", "Rhonda Byrne", 2006));
		booksList.add(new Books("Untouchable", "Mulk Raj", 1960));
		booksList.add(new Books("The Guide", "R.K.Narayan", 1951));
		booksList.add(new Books("Combat of Shadows", "Manohar Malgonkar", 1970));
		booksList.add(new Books("Sea of Poppies", "Amitav Ghosh", 2000));

		Mockito.when(
				booksService.retrieveBooksDetails()).thenReturn(booksList);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/books").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expected = "[{\"bookNames\":\"The Secret\",\"bookAuthors\":\"Rhonda Byrne\",\"yearPublished\":2006},{\"bookNames\":\"Untouchable\",\"bookAuthors\":\"Mulk Raj\",\"yearPublished\":1960},{\"bookNames\":\"The Guide\",\"bookAuthors\":\"R.K.Narayan\",\"yearPublished\":1951},{\"bookNames\":\"Combat of Shadows\",\"bookAuthors\":\"Manohar Malgonkar\",\"yearPublished\":1970},{\"bookNames\":\"Sea of Poppies\",\"bookAuthors\":\"Amitav Ghosh\",\"yearPublished\":2000}]";


		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}
	
}
