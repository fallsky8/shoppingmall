package bookshop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookshop.process.CommandAction;

public class QnaProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		//폼에서 입력 후 넘어온 qna 내용
		String qna_writer = request.getParameter("qna_writer");
		String book_title = request.getParameter("book_title");
		String qna_content = request.getParameter("qna_content");
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		Byte qora = Byte.parseByte(request.getParameter(arg0))
		return null;
	}

}
     