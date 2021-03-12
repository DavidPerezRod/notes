package me.dabiz.exception.info.application;

import me.dabiz.exception.info.Category;
import me.dabiz.exception.info.Micro;
import me.dabiz.exception.info.body.base.ApplicationExceptionCategoryInfoBody;
import me.dabiz.exception.info.body.subcategory.SubcategoryInfo;

public class ResourceExceptionInfoHeritable extends ApplicationInfo<ApplicationExceptionCategoryInfoBody> {

    public ResourceExceptionInfoHeritable(Micro micro, ApplicationExceptionCategoryInfoBody body, SubcategoryInfo subcategoryInfo) {
        super(micro, Category.PROGRAMMING, body);
        body.addExceptionBodyLeaf(subcategoryInfo);
    }
}
