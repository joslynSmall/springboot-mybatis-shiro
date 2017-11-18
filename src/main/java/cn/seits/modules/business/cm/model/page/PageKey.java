package cn.seits.modules.business.cm.model.page;

public class PageKey {
    /**
     * 页面id
     */
    private String pageId;

    /**
     * 获取页面id
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * 设置页面id
     */
    public void setPageId(String pageId) {
        this.pageId = pageId == null ? null : pageId.trim();
    }
}