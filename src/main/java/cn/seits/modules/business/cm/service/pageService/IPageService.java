package cn.seits.modules.business.cm.service.pageService;

import cn.seits.common.services.IBaseService;
import cn.seits.modules.business.cm.model.page.bo.PageDvol;

import java.util.List;

public interface IPageService<PageKey, Page, PageExample> extends IBaseService<PageKey, Page, PageExample>{
    int insertOrtherTest(Page record);

    List<PageDvol> selectPageList(PageExample example);
}
