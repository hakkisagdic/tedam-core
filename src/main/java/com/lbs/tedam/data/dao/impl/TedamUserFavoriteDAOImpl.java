/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.tedam.data.dao.impl;

import com.lbs.tedam.data.dao.TedamUserFavoriteDAO;
import com.lbs.tedam.data.repository.TedamUserFavoriteRepository;
import com.lbs.tedam.exception.localized.GeneralLocalizedException;
import com.lbs.tedam.exception.localized.LocalizedException;
import com.lbs.tedam.model.TedamUserFavorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TedamUserFavoriteDAOImpl extends BaseDAOImpl<TedamUserFavorite, Integer> implements TedamUserFavoriteDAO {

    private static final long serialVersionUID = 1L;

    private transient TedamUserFavoriteRepository repository;

    @Autowired
    public void setRepository(TedamUserFavoriteRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

    @Override
    public void deleteClientFavorite(Integer clientId) throws LocalizedException {
        try {
            repository.deleteClientFavorite(clientId);
        } catch (Exception e) {
            throw new GeneralLocalizedException(e);
        }
    }

}
