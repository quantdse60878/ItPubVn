<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>
    <xsl:param name="name" select="//*[@id='product_addtocart_form']/div[2]/div[1]/div[1]/h1"/>
    <xsl:param name="quarantyInfo" select="//*[@id='product_addtocart_form']/div[2]/div[1]/div[4]/div"/>
    <xsl:param name="description" select="//*[@id='product_addtocart_form']/div[2]/div[1]/div[5]/div"/>
    <xsl:param name="promotion" select="//*[@id='product_addtocart_form']/div[2]/div[3]/div[2]/div[1]/div"/>
    <xsl:param name="imageUrl" select="//*[@id='image']"/>
    <xsl:param name="price" select="//*[@id='price']"/>
    <xsl:param name="directLink" select="'http://localhost:8080'"/>
    <xsl:param name="info" select="//div[@class='content-thongso']//ul//li"/>
    <xsl:template match="html">
        <phone>
            <name>
                <xsl:value-of select= "normalize-space($name)"></xsl:value-of>
            </name>
            <quarantyInfo>
                <xsl:value-of select= "normalize-space($quarantyInfo)"></xsl:value-of>
            </quarantyInfo>
            <description>
                <xsl:value-of select= "normalize-space($description)"></xsl:value-of>
            </description>
            <promotion>
                <xsl:value-of select= "normalize-space($promotion)"></xsl:value-of>
            </promotion>
            <imageUrl>
                <xsl:value-of select= "normalize-space($imageUrl/@src)"></xsl:value-of>
            </imageUrl>
            <price>
                <xsl:value-of select= "normalize-space($price)"></xsl:value-of>
            </price>
            <directLink>
                <xsl:value-of select= "normalize-space($directLink)"></xsl:value-of>
            </directLink>
            <infos>
                <xsl:for-each select = "$info">
                    <property>
                            <xsl:value-of select= "normalize-space(.)"></xsl:value-of>
                    </property>
                </xsl:for-each>
            </infos>
        </phone>
    </xsl:template>
</xsl:stylesheet>