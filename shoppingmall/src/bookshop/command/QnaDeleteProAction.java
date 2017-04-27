package bookshop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookshop.process.CommandAction;

public class QnaDeleteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("utf-8");

		int qna_id = Integer.parseInt(request.getParameter("qna_id"));

		// qna_id에 해당하는 qna삭제
		QnaDBBean qnaProcess = QnaDBBean.getInstance();
		int check = qnaProcess.updateArticle(qna_id);

		request.setAttribute("check", new Integer(check));
		return "/qna/qnaDeletePro.jsp";
	}

}
