package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BizSpecification2 extends CompositeSpecification {
	//��׼����
	private Object obj;
	public BizSpecification2(Object _obj){
		this.obj = _obj;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		//���ݻ�׼����ͺ�ѡ���󣬽���ҵ���жϣ�����boolean
		return false;
	}

}