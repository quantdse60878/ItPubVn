<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"                                 
                version="1.0">
    <xsl:output method="html" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>
            <body>
                <xsl:apply-templates />
            </body>
        </html>
    </xsl:template>
    <xsl:template match="product">
        <div class="product-name"></div>
        <h1>
            <xsl:value-of select="name">
            </xsl:value-of>
        </h1>
        <h1>Price: </h1>
        <div class="price">
            <xsl:value-of select="price" />  
        </div> 
        <br/>
        <div class="product-image">
            <img style="width: 180px;height: 350px;">
                <xsl:attribute name="src">
                    <xsl:value-of select="imageUrl" />
                </xsl:attribute>
            </img>
        </div>
        <br/>
        <div class="quarantyInfo">
            <h1>Quaranty information: </h1> <br/>
            <xsl:value-of select="quarantyInfo" />
        </div> 
        <br/>
        <div class="description">
            <h1>Description: </h1> <br/>
            <xsl:value-of select="description" />  
        </div> 
        <br/>
        <div class="promotion">
            <h1>Promotion: </h1> <br/>
            <xsl:value-of select="promotion" />  
        </div> 
        <br/>
        <div class="infos">
        <h1>DETAIL: </h1> <br/>
            <xsl:for-each select = "infos/info">
                <li>
                    <strong>
                        <xsl:value-of select = "key">
                                    
                        </xsl:value-of>
                        :
                    </strong>
                    <xsl:value-of select = "value"/>
                </li> <br/>
            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>