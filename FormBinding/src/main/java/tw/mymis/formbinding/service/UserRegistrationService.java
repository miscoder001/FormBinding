package tw.mymis.formbinding.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.mymis.formbinding.DAO.EventUserDao;
import tw.mymis.formbinding.model.form.UserRegModel;

/*
   1. 檢查使用者是否已經註冊過
   2. 檢查帳號是否已經停用
   3. 檢查帳號是否已經被使用過
   4. ....

 */
@Service
public class UserRegistrationService {

    @Autowired
    EventUserDao userDao;
    public int Registration(UserRegModel user) {
        // 1:成功 , 2: 帳號已經存在 3: 包含惡意或是禁用字串
        // 收到註冊需求  先檢查帳號是否存在
        // 存在  退申請
        if (user.getUsername().contains("select") || user.getUsername().contains("delete")) {
            return 3;
        }
        // 不存在  開始檢查資料是否合規
        // 過濾 惡意字詞 可能異常字串(select , inser, update, delete 等)
        // 開始進行 帳號新增作業

    }

    public ??  ResetPassword() {

    }

    public  ?? UpdateMobile() {

    }
}
