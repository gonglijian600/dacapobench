/* Generated By:JJTree: Do not edit this line. ASTAndNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.vm.ast;

public
class ASTAndNode extends net.sourceforge.pmd.lang.vm.ast.AbstractVmNode {
  public ASTAndNode(int id) {
    super(id);
  }

  public ASTAndNode(VmParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(VmParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3d8c48d4db430658a9913ac8e779224d (do not edit this line) */
