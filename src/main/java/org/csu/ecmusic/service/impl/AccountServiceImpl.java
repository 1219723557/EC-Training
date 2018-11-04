package org.csu.ecmusic.service.impl;


import org.csu.ecmusic.model.Account.Sigon;
import org.csu.ecmusic.persistence.SigonMapper;
import org.csu.ecmusic.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    SigonMapper sigonMapper;

    /**********************实现用户登录注册************************/
    @Override
    public Sigon getSigonByUsername(String username){
        return sigonMapper.getSigonByUsername(username);
    }
    @Override
    public void setSigon(String username, String password){
        sigonMapper.setSigon(username,password);
    }
    @Override
    public void updateSigon(String username, String password){
        sigonMapper.updateSigon(username,password);
    }

    /*************************************************************/
}
