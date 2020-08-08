package com.myshop.commons.utils;

/**
 * ��ȡ�ַ���������
 */
public class SubSringUntil {
	
	private static final int ONE = -1;
	
    /**
     * ��ȡ�ַ���������
     * @param inputParams Ҫ��ȡ���Ŀ���ַ���
     * @param t ͨ��ʲô��ʽ���н�ȡ
     * @return String[]
     */
	public static String[] getSubSringUntil(String inputParams, String t) {
		return getSubSringUntilImpl(inputParams, t);
	}
	
    /**
     * ��ȡ�ַ���������
     * @param inputParams Ҫ��ȡ���Ŀ���ַ���
     * @param t ͨ��ʲô��ʽ���н�ȡ
     * @return String[]
     */
	private static final String[] getSubSringUntilImpl(String inputParams, String t) 
	{		
        if (inputParams == null || inputParams.equals("")) {
        	return null;
        } 
        else 
        {
            final int tips = inputParams.lastIndexOf(t);
            if(tips > ONE) 
            {
            	final String[] subString = inputParams.split(t);
            	return subString;
            }
         }
        
		return null;
	}
	
	
}
