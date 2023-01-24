package com.js.dto;

public class Book {
        private int book_id;//data members
        private  String book_name;//dm
        private  String author_name;//dm
        private  int no_of_pages;//dm
        private  int price;//dm we dont wanty any1 to access so we av to make them secure by private(data hiding) and provide indirect access from getter n setter method
		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getAuthor_name() {
			return author_name;
		}
		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}
		public int getNo_of_pages() {
			return no_of_pages;
		}
		public void setNo_of_pages(int no_of_pages) {
			this.no_of_pages = no_of_pages;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
		@Override
		public String toString() {
			return "Book [book_id=" + book_id + ", book_name=" + book_name + ", author_name=" + author_name
					+ ", no_of_pages=" + no_of_pages + ", price=" + price + "]";
		}
	    
}
