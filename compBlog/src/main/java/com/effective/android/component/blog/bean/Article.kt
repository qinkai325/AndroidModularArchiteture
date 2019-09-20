package com.effective.android.component.blog.bean

import com.effective.android.base.view.list.IMediaItem
import com.effective.android.component.blog.ArticleBase
import com.effective.android.component.blog.Constants

/**
 * 文章实体
 * created by yummylau on 2019/09/18
 */
class Article : ArticleBase(), IMediaItem {

    override fun getType(): Int = Constants.articleType

    override fun getViewType(): Int = Constants.articleType

    override fun replace(item: IMediaItem) {
        if (item is Article) {
            apkLink = item.apkLink
            audit = item.audit
            author = item.author
            chapterId = item.chapterId
            chapterName = item.chapterName
            collect = item.collect
            courseId = item.courseId
            desc = item.desc
            envelopePic = item.envelopePic
            fresh = item.fresh
            id = item.id
            link = item.link
            niceDate = item.niceDate
            niceShareDate = item.niceShareDate
            origin = item.origin
            prefix = item.prefix
            projectLink = item.projectLink
            publishTime = item.publishTime
            shareData = item.shareData
            shareUser = item.shareUser
            superChapterId = item.superChapterId
            superChapterName = item.superChapterName
            tags = item.tags
            title = item.title
            type = item.type
            userId = item.userId
            visible = item.visible
            zan = item.zan
        }
    }

    override fun isContentSame(item: IMediaItem): Boolean = isIdSame(item)

    override fun isIdSame(item: IMediaItem): Boolean {
        return item is Article && item.id == id
    }
}