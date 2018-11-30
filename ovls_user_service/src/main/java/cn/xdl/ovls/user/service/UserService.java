package cn.xdl.ovls.user.service;

import java.util.Map;

public interface UserService {
	/**
	 * �û�ע��
	 * @param name �˺�
	 * @param password ����
	 * @return 1:��ʾ�ɹ�;2:��ʾ�˺��Ѵ���
	 */
	public int addUser(String name,String password);
	
	/**
	 * ��¼��¼
	 * @param name �˺�
	 * @param password ����
	 * @return 1:��¼�ɹ�,token;2:�˺Ų�����;3:�������
	 */
	public Map<String, Object> checkUser(String name,String password);
	
	public boolean checkToken(String token,String userId);
}
