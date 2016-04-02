package com.ilearn.dao;

import com.ilearn.bean.ResourcesEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by sl on 16-4-2.
 */
@Repository("resourcesDao")
public class ResourcesDao extends BaseDao {

    public ResourcesEntity getById(int rid){
        return get(ResourcesEntity.class, rid);
    }


    public void saveResource(int id , String  classify , String title , String url){

        ResourcesEntity resourcesEntity = new ResourcesEntity();

        resourcesEntity.setTitle(title);
        resourcesEntity.setClassify(classify);
        resourcesEntity.setImgurl("123");
        resourcesEntity.setUrl(url);
        resourcesEntity.setRid(id);
        save(resourcesEntity);

    }
}
