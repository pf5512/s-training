package com.csm.straining.article.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csm.straining.article.service.ArticleService;
import com.csm.straining.common.exception.AppException;
import com.csm.straining.common.model.info.common.ErrorStatus;
import com.csm.straining.framework.http.page.AuthJsonViewPage;
import com.lamfire.utils.NumberUtils;


/**
 * @author chensongming
 */
public class ArticleRecommedListPage extends AuthJsonViewPage {

	private static final Logger logger = LoggerFactory.getLogger(ArticleRecommedListPage.class);
	
	@Override
	protected Object doService() {
		try {
			
			long start = NumberUtils.toLong(getParamString("start"), 0);
			int count = NumberUtils.toInt(getParamString("count"), 20);
			
			return ArticleService.articleRecommendListResp(currentUserID, start, count);
		} catch (AppException e) {
			logger.debug("[ArticleCreatePage] AppException :", e);
			return new ErrorStatus(e);
		} catch (Exception e) {
			logger.debug("[ArticleCreatePage] Exception :", e);
			return new ErrorStatus(100);
		}
	}
	

}
